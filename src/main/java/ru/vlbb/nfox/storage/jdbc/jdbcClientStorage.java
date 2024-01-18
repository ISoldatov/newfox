package ru.vlbb.nfox.storage.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.vlbb.nfox.model.Client;
import ru.vlbb.nfox.model.ClientType;
import ru.vlbb.nfox.service.ClientService;
import ru.vlbb.nfox.storage.ClientStorage;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class jdbcClientStorage implements ClientStorage {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public jdbcClientStorage(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }

    @Override
    public Client get(String inn) {
        String sqlQuery = "SELECT c.ICUSNUM as num, " +
                "                 c.CCUSNAME_SH as name, " +
                "                 c.CCUSFLAG as type, " +
                "                 c.CCUSNUMNAL as inn " +
                "            FROM CUS c " +
                "           WHERE c.CCUSNUMNAL=? ";

        try {

            return jdbcTemplate.queryForObject(sqlQuery, (RowMapper<Client>) (rs, rowNum) -> {
                int typeNum = Integer.parseInt(rs.getString("type"));
                ClientType clientType = null;
                switch (typeNum) {
                    case 1:
                        clientType = ClientType.FL;
                        break;
                    case 2:
                        clientType = ClientType.UL;
                        break;
                    case 3:
                        clientType = ClientType.FUL;
                        break;
                    case 4:
                        clientType = ClientType.IP;
                        break;
                    case 5:
                        clientType = ClientType.B;
                        break;
                }

                return Client.builder()
                        .id(rs.getInt("num"))
                        .name(rs.getString("name"))
                        .inn(rs.getString("inn"))
                        .type(clientType)
                        .build();
            }, inn);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}

package ru.vlbb.nfox.model;

public enum ClientType {
    FL(1, "Физ. лицо"),
    UL(2, "Юр. лицо"),
    FUL(3, "Филиал ЮЛ"),
    IP(4, "ИП"),
    B(5, "Банк");

    private final int flag;
    private final String title;

    ClientType(int flag, String title) {
        this.flag = flag;
        this.title = title;
    }

    public int getFlag() {
        return flag;
    }

    public String getTitle() {
        return title;
    }

}

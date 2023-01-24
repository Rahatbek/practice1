package com.rahatbek.mytest.shablonproekt.behavioral.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new Database();
        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        developer.insetRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}

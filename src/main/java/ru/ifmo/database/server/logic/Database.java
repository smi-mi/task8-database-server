package ru.ifmo.database.server.logic;

import ru.ifmo.database.server.exception.DatabaseException;

public interface Database {
    String getName();

    void createTableIfNotExists(String tableName) throws DatabaseException;

    void createTableIfNotExists(String tableName, int segmentSizeInBytes) throws DatabaseException;

    void write(String tableName, String objectKey, String objectValue) throws DatabaseException;

    String read(String tableName, String objectKey) throws DatabaseException;
}
package com.example.di07.model;

import java.util.Arrays;
import java.util.List;

public class OracleDatabaseDAO implements DatabaseDAO {
    @Override
    public List<String> list() {
        return Arrays.asList("홍길동 2", "박문수 2");
    }
}

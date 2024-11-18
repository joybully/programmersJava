package com.example.di05;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter @Setter
public class BoardMapTO {
    private HashMap<String, String> userMaps;
    private HashMap<String, BoardTO> boardMaps;
}

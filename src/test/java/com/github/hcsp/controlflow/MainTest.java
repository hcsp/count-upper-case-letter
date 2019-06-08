package com.github.hcsp.controlflow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void test() {
        int n = new java.util.Random().nextInt(50) + 50;
        String str =
                java.util.stream.IntStream.range(n, n + 20)
                        .mapToObj(i -> String.format("%c", i))
                        .collect(java.util.stream.Collectors.joining(""));
        assertEquals(
                (int) str.chars().filter(Character::isUpperCase).count(),
                Main.countUpperCaseLetters(str));
    }
}

package org.example.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelegramTest {

    @Test
    @DisplayName("텔레그램에 내가 원하는 메세지를 출력 가능 합니다!")
    void example() {
        //given
        Telegram telegram = new Telegram();

        //when
        String example = telegram.example();

        //then
        assertEquals(example, "YES");
    }
}
package com.notryken.commandkeys.config;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a control with three states, arbitrarily ZERO, ONE, TWO, and THREE
 */
public class QuadState {

    public enum State {
        ZERO,
        ONE,
        TWO,
        THREE,
    }

    public @NotNull State state;

    public QuadState() {
        this.state = State.ZERO;
    }

    public QuadState(@NotNull State state) {
        this.state = state;
    }
}

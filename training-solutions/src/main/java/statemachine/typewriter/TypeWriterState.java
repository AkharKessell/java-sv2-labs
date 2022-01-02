package statemachine.typewriter;

public enum TypeWriterState {

    UPPERCASE {
        public TypeWriterState changeCase() {
            return TypeWriterState.LOWERCASE;
        }
    },
    LOWERCASE {
        public TypeWriterState changeCase() {
            return TypeWriterState.UPPERCASE;
        }
    };

    abstract TypeWriterState changeCase();
}
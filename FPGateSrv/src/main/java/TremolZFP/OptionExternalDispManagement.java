package TremolZFP;
    public enum OptionExternalDispManagement {
        Auto("0"),
        Manuel("1");

        private final String value;
        private OptionExternalDispManagement(String value) {
            this.value = value;
        }
        public String toString() {
            return value;
        }
    }

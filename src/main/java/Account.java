public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.length() >= 3 && name.length() <= 19 && checkBlanks() == true && countBlanksInText() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkBlanks() {
        String nameWithoutBlanks = name.trim();
        return name == nameWithoutBlanks;
    }

    public int countBlanksInText() {
        int spaceCount = 0;
        for (char c : name.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }
}
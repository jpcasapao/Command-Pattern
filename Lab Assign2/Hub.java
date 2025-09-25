class Hub {
    private Command[] commands;
    public Hub(int slots) {
        commands = new Command[slots];
    }
    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }
    public void pressButton(int slot) {
        if (commands[slot] != null) {
            commands[slot].execute();
        } else {
            System.out.println("No command assigned to this button.");
        }
    }
}
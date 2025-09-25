class SetVolumeCommand implements Command {
    private MusicPlayer player;
    private int level;
    public SetVolumeCommand(MusicPlayer player, int level) {
        this.player = player;
        this.level = level;
    }
    @Override
    public void execute() { player.setVolume(level); }
}
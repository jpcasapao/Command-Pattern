class PlayPlaylistCommand implements Command {
    private MusicPlayer player;
    private String playlist;
    public PlayPlaylistCommand(MusicPlayer player, String playlist) {
        this.player = player;
        this.playlist = playlist;
    }
    public void execute() { player.play(playlist); }
}
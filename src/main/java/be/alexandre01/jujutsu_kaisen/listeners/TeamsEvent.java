package be.alexandre01.jujutsu_kaisen.listeners;


import be.alexandre01.inazuma.uhc.InazumaUHC;
import be.alexandre01.inazuma.uhc.custom_events.teams.TeamSafeTeleportEvent;
import be.alexandre01.inazuma.uhc.timers.Timer;
import be.alexandre01.inazuma.uhc.timers.game.StartingTimer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class TeamsEvent implements Listener {
    private InazumaUHC i;
    public TeamsEvent(){
         i = InazumaUHC.get;
    }
    @EventHandler
    public void onTeamTeleport(TeamSafeTeleportEvent event){
        Timer timer = i.tm.getTimer(StartingTimer.class);
        timer.runTaskTimerAsynchronously(i,0,20);
    }


}

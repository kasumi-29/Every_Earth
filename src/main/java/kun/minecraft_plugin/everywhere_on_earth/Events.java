package kun.minecraft_plugin.everywhere_on_earth;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.BlockData;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class Events implements Listener {
    private final Everywhere_on_earth m;
    public Events(Everywhere_on_earth m){
        this.m=m;
    }

    @EventHandler
    public void BlockBreakEvent(BlockBreakEvent event){
        Block b=event.getBlock();
        BlockData m1 =Material.VOID_AIR.createBlockData();
        BlockData m2 =Material.BEDROCK.createBlockData();

        for(;;){
            b=b.getRelative(BlockFace.UP,1);
            if(b.getBlockData().matches(m1)||b.getBlockData().matches(m2)){break;}
            b.setType(Material.AIR);
        }
    }
}

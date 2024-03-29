package be.alexandre01.jujutsu_kaisen.roles;

import be.alexandre01.inazuma.uhc.presets.IPreset;
import be.alexandre01.inazuma.uhc.roles.Role;
import be.alexandre01.inazuma.uhc.roles.RoleItem;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ItadoriYuji extends Role {
    public ItadoriYuji(IPreset preset) {
        super("Itadori Yuji",preset);
        RoleItem eclairNoir = new RoleItem();
        eclairNoir.setItemstack(new ItemStack(Material.COBBLESTONE));

        eclairNoir.setRightClickOnPlayer((player, rightClicked) -> {
            player.sendMessage("Tu as click droit sur "+rightClicked.getName());
            rightClicked.sendMessage("Ouille ouille ouille, ça va piquer pour toi mon cher ami");
        });


        addRoleItem(eclairNoir);
        onLoad((Player player) -> {
            player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, Integer.MAX_VALUE, 0,false,false), true);
        });
    }
}

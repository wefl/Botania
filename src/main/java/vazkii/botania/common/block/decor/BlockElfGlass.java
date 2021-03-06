/*
 * This class is distributed as part of the Botania Mod.
 * Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 *
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 */
package vazkii.botania.common.block.decor;

import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.item.ItemStack;

import vazkii.botania.api.recipe.IElvenItem;

public class BlockElfGlass extends AbstractGlassBlock implements IElvenItem {

	public BlockElfGlass(Properties builder) {
		super(builder);
	}

	@Override
	public boolean isElvenItem(ItemStack stack) {
		return true;
	}

}

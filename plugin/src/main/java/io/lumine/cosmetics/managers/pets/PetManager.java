package io.lumine.cosmetics.managers.pets;

import io.lumine.cosmetics.MCCosmeticsPlugin;
import io.lumine.cosmetics.managers.MCCosmeticsManager;
import io.lumine.cosmetics.players.Profile;

import java.io.File;

public class PetManager extends MCCosmeticsManager<Pet> {

	public PetManager(MCCosmeticsPlugin plugin, Class<Pet> petClass) {
		super(plugin, petClass);
	}

	@Override
	public Pet build(File file, String node) {
		return new Pet(file, node);
	}

	@Override
	public void equip(Profile profile) {
		// TODO: 15/3/2022 Impl pet
	}
}

package io.lumine.cosmetics.constants;

import io.lumine.cosmetics.api.cosmetics.Cosmetic;
import io.lumine.cosmetics.managers.back.BackAccessory;
import io.lumine.cosmetics.managers.hats.Hat;
import io.lumine.cosmetics.managers.modelengine.MEGAccessory;
import io.lumine.cosmetics.managers.particle.ParticleAccessory;
import io.lumine.cosmetics.managers.pets.Pet;

import java.util.HashMap;
import java.util.Map;

public class CosmeticType {

    private static final Map<Class<? extends Cosmetic>, CosmeticConstant> constants = new HashMap<>();

    static {
        register(BackAccessory.class, new CosmeticConstant("BACK", "backs"));
        register(Hat.class, new CosmeticConstant("HAT", "hats"));
        register(MEGAccessory.class, new CosmeticConstant("MEG", "modelengine"));
        register(ParticleAccessory.class, new CosmeticConstant("PARTICLE", "particle"));
        register(Pet.class, new CosmeticConstant("PET", "pet"));
    }

    public static void register(Class<? extends Cosmetic> clazz, CosmeticConstant cosmeticConstant) {
        constants.put(clazz, cosmeticConstant);
    }

    public static CosmeticConstant get(Class<? extends Cosmetic> tClass) {
        return constants.get(tClass);
    }

    public static String type(Class<? extends Cosmetic> tClass) {
        return get(tClass).type();
    }

    public static String folder(Class<? extends Cosmetic> tClass) {
        return get(tClass).folder();
    }

    public record CosmeticConstant(String type, String folder) {}

}

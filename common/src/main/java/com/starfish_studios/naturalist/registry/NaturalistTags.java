package com.starfish_studios.naturalist.registry;

import com.starfish_studios.naturalist.Naturalist;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;

public class NaturalistTags {
    public static class BlockTags {
        public static final TagKey<Block> FIREFLIES_SPAWNABLE_ON = tag("fireflies_spawnable_on");
        public static final TagKey<Block> VULTURE_PERCH_BLOCKS = tag("vulture_perch_blocks");
        public static final TagKey<Block> VULTURES_SPAWNABLE_ON = tag("vultures_spawnable_on");

        private static TagKey<Block> tag(String name) {
            return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(Naturalist.MOD_ID, name));
        }
    }

    public static class ItemTags {
        public static final TagKey<Item> BIRD_FOOD_ITEMS = tag("bird_food_items");
        public static final TagKey<Item> GIRAFFE_FOOD_ITEMS = tag("giraffe_food_items");
        public static final TagKey<Item> BOAR_FOOD_ITEMS = tag("boar_food_items");

        private static TagKey<Item> tag(String name) {
            return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(Naturalist.MOD_ID, name));
        }
    }

    public static class EntityTypes {
        public static final TagKey<EntityType<?>> DEER_PREDATORS = tag("deer_predators");
        public static final TagKey<EntityType<?>> LION_HOSTILES = tag("lion_hostiles");
        public static final TagKey<EntityType<?>> VULTURE_HOSTILES = tag("vulture_hostiles");

        private static TagKey<EntityType<?>> tag(String name) {
            return TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation(Naturalist.MOD_ID, name));
        }
    }

    public static class Biomes {
        public static final TagKey<Biome> HAS_DEER = tag("has_deer");
        public static final TagKey<Biome> HAS_SNAIL = tag("has_snail");
        public static final TagKey<Biome> HAS_FIREFLY = tag("has_firefly");
        public static final TagKey<Biome> HAS_BUTTERFLY = tag("has_butterfly");
        public static final TagKey<Biome> HAS_BLUEJAY = tag("has_bluejay");
        public static final TagKey<Biome> HAS_CANARY = tag("has_canary");
        public static final TagKey<Biome> HAS_CARDINAL = tag("has_cardinal");
        public static final TagKey<Biome> HAS_ROBIN = tag("has_robin");
        public static final TagKey<Biome> HAS_LION = tag("has_lion");
        public static final TagKey<Biome> HAS_ZEBRA = tag("has_zebra");
        public static final TagKey<Biome> HAS_GIRAFFE = tag("has_giraffe");
        public static final TagKey<Biome> HAS_HIPPO = tag("has_hippo");
        public static final TagKey<Biome> HAS_VULTURE = tag("has_vulture");
        public static final TagKey<Biome> HAS_BOAR = tag("has_boar");

        private static TagKey<Biome> tag(String name) {
            return TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(Naturalist.MOD_ID, name));
        }
    }
}

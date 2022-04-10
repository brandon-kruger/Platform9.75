package repository;

import entity.ScreeningRoom;

import java.util.HashSet;
import java.util.Set;

public class ScreeningRoomRepository implements  IScreeningRoomRepository{
    private static ScreeningRoomRepository repository = null;
    private Set<ScreeningRoom> srDB;

    private ScreeningRoomRepository() {
        this.srDB = new HashSet<>();
    }

    public static ScreeningRoomRepository getRepository() {
        if (repository == null) {
            repository = new ScreeningRoomRepository();
        }
        return repository;
    }

    @Override
    public ScreeningRoom create(ScreeningRoom screeningRoom) {
        this.srDB.add(screeningRoom);
        return screeningRoom;
    }

    @Override
    public ScreeningRoom read(String screen) {
        for (ScreeningRoom c : srDB) {
            if (c.getScreen().equals(screen)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public ScreeningRoom update(ScreeningRoom screeningRoom) {
        ScreeningRoom asr = read(screeningRoom.getScreen());
        if (asr != null) {
            srDB.remove(asr);
            srDB.add(screeningRoom);
            return screeningRoom;
        }
        return null;
    }

    @Override
    public void delete(String screen) {
        ScreeningRoom deleteSC = read(screen);
        if (deleteSC == null) {
            System.out.println("Screening Room is null.");
        }
        srDB.remove(deleteSC);
        System.out.println("Screening Room removed.");
    }

    @Override
    public Set<ScreeningRoom> getAll() {
        return srDB;
    }
}

package repository;


import entity.ScreeningRoom;

import java.util.Set;

public interface IScreeningRoomRepository extends IRepository<ScreeningRoom, String>{
    public Set<ScreeningRoom> getAll();
}

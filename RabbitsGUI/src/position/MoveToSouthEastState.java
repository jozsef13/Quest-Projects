package position;

import java.io.Serializable;

import player.PlayerRole;

public class MoveToSouthEastState implements PositionStateRole, Serializable {

	private PositionRole innerPosition;
	private PositionStateRole nextState;

	public MoveToSouthEastState(PositionRole innerPosition) {
		super();
		this.innerPosition = innerPosition;
	}

	public void setNextState(PositionStateRole nextState) {
		this.nextState = nextState;
	}

	@Override
	public void move() {
		innerPosition.moveSouthEast();
	}

	@Override
	public void searchForPrizeBy(PlayerRole player) {
		innerPosition.searchForPrizeBy(player);
	}

	@Override
	public PositionStateRole next() {
		return nextState;
	}

	@Override
	public boolean isInitialState() {
		return innerPosition.isOnNorthWestCorner();
	}

	@Override
	public int getX() {
		return innerPosition.getX();
	}

	@Override
	public int getY() {
		return innerPosition.getY();
	}

	@Override
	public boolean isOnOutsideParcel() {
		return innerPosition.isOnOutsideParcel();
	}
}

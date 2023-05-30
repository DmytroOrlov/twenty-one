package twenty_one.repo

import leaderboard.model.QueryFailure
import twenty_one.model.{SessionId, UserSession}
import zio.*

trait Session {
  def setSession(sessionId: SessionId): IO[QueryFailure, Unit]

  def getSession(sessionId: SessionId): IO[QueryFailure, Option[UserSession]]
}

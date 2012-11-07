/**
 * Created with IntelliJ IDEA.
 * User: lukasz.glusiuk
 * Date: 07/11/12
 * Time: 20:33
 * To change this template use File | Settings | File Templates.
 */

package com.fresspace.server.model.user{
import javax.persistence._
import scala.math.BigInt

@Entity
@Table(name = "users")
class User
{
  /**
   * The id.
   */
  @Id
  var id:BigInt = _
  /**
   * The email address.
   */
  @Column(nullable = false, length = 64, unique = true)
  var email:String = _
}
}
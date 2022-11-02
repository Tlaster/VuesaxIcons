package moe.tlaster.icons.vuesax.vuesaxicons

import androidx.compose.ui.graphics.vector.ImageVector
import moe.tlaster.icons.vuesax.VuesaxIcons
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.Bold
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.Broken
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.Bulk
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.Default
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.Linear
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.Outline
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.Twotone
import kotlin.collections.List as ____KtList

public object CryptoGroup

public val VuesaxIcons.Crypto: CryptoGroup
  get() = CryptoGroup

private var __Default: ____KtList<ImageVector>? = null

public val CryptoGroup.Default: ____KtList<ImageVector>
  get() {
    if (__Default != null) {
      return __Default!!
    }
    __Default= Bold.Default + Broken.Default + Bulk.Default + Linear.Default + Outline.Default +
        Twotone.Default + listOf()
    return __Default!!
  }

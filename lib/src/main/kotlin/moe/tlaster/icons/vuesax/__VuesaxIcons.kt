package moe.tlaster.icons.vuesax

import androidx.compose.ui.graphics.vector.ImageVector
import moe.tlaster.icons.vuesax.vuesaxicons.Bold
import moe.tlaster.icons.vuesax.vuesaxicons.Broken
import moe.tlaster.icons.vuesax.vuesaxicons.Bulk
import moe.tlaster.icons.vuesax.vuesaxicons.Default
import moe.tlaster.icons.vuesax.vuesaxicons.Linear
import moe.tlaster.icons.vuesax.vuesaxicons.Outline
import moe.tlaster.icons.vuesax.vuesaxicons.Twotone
import kotlin.collections.List as ____KtList

public object VuesaxIcons

private var __Default: ____KtList<ImageVector>? = null

public val VuesaxIcons.Default: ____KtList<ImageVector>
  get() {
    if (__Default != null) {
      return __Default!!
    }
    __Default= Bold.Default + Broken.Default + Bulk.Default + Linear.Default + Outline.Default +
        Twotone.Default + listOf()
    return __Default!!
  }

package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Celo-(celo)`: ImageVector
    get() {
        if (`_celo-(celo)` != null) {
            return `_celo-(celo)`!!
        }
        `_celo-(celo)` = Builder(name = "Celo-(celo)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 16.0f)
                curveTo(18.866f, 16.0f, 22.0f, 12.866f, 22.0f, 9.0f)
                curveTo(22.0f, 5.134f, 18.866f, 2.0f, 15.0f, 2.0f)
                curveTo(11.134f, 2.0f, 8.0f, 5.134f, 8.0f, 9.0f)
                curveTo(8.0f, 12.866f, 11.134f, 16.0f, 15.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                curveTo(12.866f, 22.0f, 16.0f, 18.866f, 16.0f, 15.0f)
                curveTo(16.0f, 11.134f, 12.866f, 8.0f, 9.0f, 8.0f)
                curveTo(5.134f, 8.0f, 2.0f, 11.134f, 2.0f, 15.0f)
                curveTo(2.0f, 18.866f, 5.134f, 22.0f, 9.0f, 22.0f)
                close()
            }
        }
        .build()
        return `_celo-(celo)`!!
    }

private var `_celo-(celo)`: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Trontron-(trx)`: ImageVector
    get() {
        if (`_trontron-(trx)` != null) {
            return `_trontron-(trx)`!!
        }
        `_trontron-(trx)` = Builder(name = "Trontron-(trx)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.5999f, 3.6f)
                lineTo(9.2999f, 20.4f)
                curveTo(9.6999f, 21.3f, 10.3999f, 21.4f, 10.9999f, 20.6f)
                lineTo(20.3999f, 8.7f)
                curveTo(20.6999f, 8.3f, 20.6999f, 7.7f, 20.2999f, 7.4f)
                lineTo(17.1999f, 4.3f)
                curveTo(17.0999f, 4.1f, 16.7999f, 4.0f, 16.6999f, 4.0f)
                lineTo(3.6999f, 2.3f)
                curveTo(2.7999f, 2.1f, 2.2999f, 2.7f, 2.5999f, 3.6f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 20.9999f)
                lineTo(11.0f, 9.9999f)
                lineTo(3.0f, 2.8999f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF17191C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                lineTo(11.0f, 10.0f)
                lineTo(20.0f, 8.2f)
            }
        }
        .build()
        return `_trontron-(trx)`!!
    }

private var `_trontron-(trx)`: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.`Iost-(iost)`: ImageVector
    get() {
        if (`_iost-(iost)` != null) {
            return `_iost-(iost)`!!
        }
        `_iost-(iost)` = Builder(name = "Iost-(iost)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.5f, 12.87f)
                verticalLineTo(15.85f)
                curveTo(3.5f, 16.56f, 3.88f, 17.21f, 4.49f, 17.57f)
                lineTo(10.99f, 21.39f)
                curveTo(11.62f, 21.76f, 12.39f, 21.76f, 13.02f, 21.39f)
                lineTo(19.52f, 17.57f)
                curveTo(20.13f, 17.21f, 20.51f, 16.55f, 20.51f, 15.85f)
                verticalLineTo(8.14f)
                curveTo(20.51f, 7.43f, 20.13f, 6.78f, 19.52f, 6.42f)
                lineTo(13.02f, 2.6f)
                curveTo(12.39f, 2.23f, 11.62f, 2.23f, 10.99f, 2.6f)
                lineTo(4.49f, 6.42f)
                curveTo(3.88f, 6.78f, 3.5f, 7.44f, 3.5f, 8.14f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                lineTo(12.0f, 6.0f)
                lineTo(7.0f, 9.0f)
                lineTo(17.0f, 15.0f)
                lineTo(12.0f, 18.0f)
                lineTo(7.0f, 15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.5f, 10.0f)
                lineTo(9.5f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 12.0f)
                lineTo(12.5f, 14.0f)
            }
        }
        .build()
        return `_iost-(iost)`!!
    }

private var `_iost-(iost)`: ImageVector? = null

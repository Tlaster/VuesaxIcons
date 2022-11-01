package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.`Ankr-(ankr)`: ImageVector
    get() {
        if (`_ankr-(ankr)` != null) {
            return `_ankr-(ankr)`!!
        }
        `_ankr-(ankr)` = Builder(name = "Ankr-(ankr)", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.1103f, 9.78f)
                verticalLineTo(6.44f)
                lineTo(12.0004f, 2.0f)
                lineTo(20.8904f, 6.44f)
                verticalLineTo(9.78f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.1103f, 14.2202f)
                verticalLineTo(17.5602f)
                lineTo(12.0004f, 22.0002f)
                lineTo(20.8904f, 17.5602f)
                verticalLineTo(14.2202f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 21.9999f)
                verticalLineTo(16.4399f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9996f, 16.4401f)
                curveTo(14.4517f, 16.4401f, 16.4396f, 14.4522f, 16.4396f, 12.0001f)
                curveTo(16.4396f, 9.5479f, 14.4517f, 7.5601f, 11.9996f, 7.5601f)
                curveTo(9.5474f, 7.5601f, 7.5596f, 9.5479f, 7.5596f, 12.0001f)
                curveTo(7.5596f, 14.4522f, 9.5474f, 16.4401f, 11.9996f, 16.4401f)
                close()
            }
        }
        .build()
        return `_ankr-(ankr)`!!
    }

private var `_ankr-(ankr)`: ImageVector? = null

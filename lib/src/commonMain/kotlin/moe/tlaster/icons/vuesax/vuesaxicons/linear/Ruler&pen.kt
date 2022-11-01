package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Ruler&pen`: ImageVector
    get() {
        if (`_ruler&pen` != null) {
            return `_ruler&pen`!!
        }
        `_ruler&pen` = Builder(name = "Ruler&pen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.47f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.47f, 3.0f, 20.47f, 2.0f, 18.47f, 2.0f)
                horizontalLineTo(14.47f)
                curveTo(12.47f, 2.0f, 11.47f, 3.0f, 11.47f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(11.47f, 21.0f, 12.47f, 22.0f, 14.47f, 22.0f)
                horizontalLineTo(18.47f)
                curveTo(20.47f, 22.0f, 21.47f, 21.0f, 21.47f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.47f, 6.0f)
                horizontalLineTo(16.47f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.47f, 18.0f)
                horizontalLineTo(15.47f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.47f, 13.95f)
                lineTo(16.47f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.47f, 10.0f)
                horizontalLineTo(14.47f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.49f, 2.0f)
                curveTo(3.86f, 2.0f, 2.53f, 3.33f, 2.53f, 4.95f)
                verticalLineTo(17.91f)
                curveTo(2.53f, 18.36f, 2.72f, 19.04f, 2.95f, 19.43f)
                lineTo(3.77f, 20.79f)
                curveTo(4.71f, 22.36f, 6.26f, 22.36f, 7.2f, 20.79f)
                lineTo(8.02f, 19.43f)
                curveTo(8.25f, 19.04f, 8.44f, 18.36f, 8.44f, 17.91f)
                verticalLineTo(4.95f)
                curveTo(8.44f, 3.33f, 7.11f, 2.0f, 5.49f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.44f, 7.0f)
                horizontalLineTo(2.53f)
            }
        }
        .build()
        return `_ruler&pen`!!
    }

private var `_ruler&pen`: ImageVector? = null

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

public val LinearGroup.`Printer-slash`: ImageVector
    get() {
        if (`_printer-slash` != null) {
            return `_printer-slash`!!
        }
        `_printer-slash` = Builder(name = "Printer-slash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.25f, 7.0f)
                horizontalLineTo(16.75f)
                verticalLineTo(5.0f)
                curveTo(16.75f, 3.0f, 16.0f, 2.0f, 13.75f, 2.0f)
                horizontalLineTo(10.25f)
                curveTo(8.0f, 2.0f, 7.25f, 3.0f, 7.25f, 5.0f)
                verticalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.9699f, 15.0f)
                horizontalLineTo(15.9999f)
                verticalLineTo(19.0f)
                curveTo(15.9999f, 21.0f, 14.9999f, 22.0f, 12.9999f, 22.0f)
                horizontalLineTo(10.9999f)
                curveTo(9.3099f, 22.0f, 8.33f, 21.29f, 8.07f, 19.86f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 18.0f)
                curveTo(4.0f, 18.0f, 3.0f, 17.0f, 3.0f, 15.0f)
                verticalLineTo(10.0f)
                curveTo(3.0f, 8.0f, 4.0f, 7.0f, 6.0f, 7.0f)
                horizontalLineTo(16.59f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.97f, 7.52f)
                curveTo(20.66f, 8.0f, 21.0f, 8.83f, 21.0f, 10.0f)
                verticalLineTo(15.0f)
                curveTo(21.0f, 17.0f, 20.0f, 18.0f, 18.0f, 18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 15.0f)
                horizontalLineTo(15.79f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                horizontalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 2.0f)
                lineTo(2.0f, 22.0f)
            }
        }
        .build()
        return `_printer-slash`!!
    }

private var `_printer-slash`: ImageVector? = null

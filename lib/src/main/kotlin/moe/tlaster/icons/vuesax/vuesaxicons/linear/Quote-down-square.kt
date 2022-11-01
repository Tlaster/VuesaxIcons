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

public val LinearGroup.`Quote-down-square`: ImageVector
    get() {
        if (`_quote-down-square` != null) {
            return `_quote-down-square`!!
        }
        `_quote-down-square` = Builder(name = "Quote-down-square", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 12.1599f)
                horizontalLineTo(9.68f)
                curveTo(10.39f, 12.1599f, 10.87f, 12.6999f, 10.87f, 13.3499f)
                verticalLineTo(14.84f)
                curveTo(10.87f, 15.49f, 10.39f, 16.03f, 9.68f, 16.03f)
                horizontalLineTo(8.19f)
                curveTo(7.54f, 16.03f, 7.0f, 15.49f, 7.0f, 14.84f)
                verticalLineTo(12.1599f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 12.16f)
                curveTo(7.0f, 9.37f, 7.52f, 8.9f, 9.09f, 7.97f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.1399f, 12.1599f)
                horizontalLineTo(15.8199f)
                curveTo(16.5299f, 12.1599f, 17.0099f, 12.6999f, 17.0099f, 13.3499f)
                verticalLineTo(14.84f)
                curveTo(17.0099f, 15.49f, 16.5299f, 16.03f, 15.8199f, 16.03f)
                horizontalLineTo(14.3299f)
                curveTo(13.6799f, 16.03f, 13.1399f, 15.49f, 13.1399f, 14.84f)
                verticalLineTo(12.1599f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.1399f, 12.16f)
                curveTo(13.1399f, 9.37f, 13.6599f, 8.9f, 15.2299f, 7.97f)
            }
        }
        .build()
        return `_quote-down-square`!!
    }

private var `_quote-down-square`: ImageVector? = null

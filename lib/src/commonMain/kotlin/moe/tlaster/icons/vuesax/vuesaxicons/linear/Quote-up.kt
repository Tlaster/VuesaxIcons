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

public val LinearGroup.`Quote-up`: ImageVector
    get() {
        if (`_quote-up` != null) {
            return `_quote-up`!!
        }
        `_quote-up` = Builder(name = "Quote-up", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.3501f)
                horizontalLineTo(7.8f)
                curveTo(9.33f, 12.3501f, 10.38f, 13.5101f, 10.38f, 14.9301f)
                verticalLineTo(18.1501f)
                curveTo(10.38f, 19.5701f, 9.33f, 20.7301f, 7.8f, 20.7301f)
                horizontalLineTo(4.58f)
                curveTo(3.16f, 20.7301f, 2.0f, 19.5701f, 2.0f, 18.1501f)
                verticalLineTo(12.3501f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.35f)
                curveTo(2.0f, 6.3f, 3.13f, 5.3f, 6.53f, 3.28f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.6299f, 12.3501f)
                horizontalLineTo(19.4299f)
                curveTo(20.9599f, 12.3501f, 22.0099f, 13.5101f, 22.0099f, 14.9301f)
                verticalLineTo(18.1501f)
                curveTo(22.0099f, 19.5701f, 20.9599f, 20.7301f, 19.4299f, 20.7301f)
                horizontalLineTo(16.2099f)
                curveTo(14.7899f, 20.7301f, 13.6299f, 19.5701f, 13.6299f, 18.1501f)
                verticalLineTo(12.3501f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.6299f, 12.35f)
                curveTo(13.6299f, 6.3f, 14.7599f, 5.3f, 18.1599f, 3.28f)
            }
        }
        .build()
        return `_quote-up`!!
    }

private var `_quote-up`: ImageVector? = null

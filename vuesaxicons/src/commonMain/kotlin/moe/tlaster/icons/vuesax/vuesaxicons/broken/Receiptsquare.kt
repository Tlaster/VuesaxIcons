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

public val BrokenGroup.Receiptsquare: ImageVector
    get() {
        if (_receiptsquare != null) {
            return _receiptsquare!!
        }
        _receiptsquare = Builder(name = "Receiptsquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.94f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(20.0f, 22.0f, 22.0f, 20.0f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.9998f, 13.0401f)
                verticalLineTo(15.7001f)
                curveTo(16.9998f, 17.2701f, 16.1398f, 17.6401f, 15.0998f, 16.5201f)
                curveTo(14.6198f, 16.0101f, 13.8797f, 16.0501f, 13.4597f, 16.6101f)
                lineTo(12.8597f, 17.4101f)
                curveTo(12.3897f, 18.0401f, 11.6098f, 18.0401f, 11.1398f, 17.4101f)
                lineTo(10.5497f, 16.6201f)
                curveTo(10.1297f, 16.0601f, 9.3898f, 16.0201f, 8.9098f, 16.5301f)
                curveTo(7.8598f, 17.6501f, 7.0098f, 17.2801f, 7.0098f, 15.7101f)
                verticalLineTo(9.0801f)
                curveTo(7.0098f, 6.7101f, 7.5698f, 6.1201f, 9.7898f, 6.1201f)
                horizontalLineTo(14.2298f)
                curveTo(16.4498f, 6.1201f, 17.0098f, 6.7101f, 17.0098f, 9.0801f)
            }
        }
        .build()
        return _receiptsquare!!
    }

private var _receiptsquare: ImageVector? = null

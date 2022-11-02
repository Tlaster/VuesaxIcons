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

public val LinearGroup.Receiptsquare: ImageVector
    get() {
        if (_receiptsquare != null) {
            return _receiptsquare!!
        }
        _receiptsquare = Builder(name = "Receiptsquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(8.9f, 16.5299f)
                curveTo(9.38f, 16.0099f, 10.12f, 16.0499f, 10.54f, 16.6199f)
                lineTo(11.14f, 17.4199f)
                curveTo(11.61f, 18.0499f, 12.39f, 18.0499f, 12.86f, 17.4199f)
                lineTo(13.45f, 16.6299f)
                curveTo(13.87f, 16.0699f, 14.61f, 16.0299f, 15.09f, 16.5399f)
                curveTo(16.14f, 17.6599f, 16.99f, 17.2899f, 16.99f, 15.7199f)
                verticalLineTo(9.0899f)
                curveTo(16.99f, 6.7199f, 16.43f, 6.1299f, 14.21f, 6.1299f)
                horizontalLineTo(9.77f)
                curveTo(7.55f, 6.1299f, 6.99f, 6.7199f, 6.99f, 9.0899f)
                verticalLineTo(15.7199f)
                curveTo(7.0f, 17.2699f, 7.86f, 17.6399f, 8.9f, 16.5299f)
                close()
            }
        }
        .build()
        return _receiptsquare!!
    }

private var _receiptsquare: ImageVector? = null

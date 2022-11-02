package moe.tlaster.icons.vuesax.vuesaxicons.twotone

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
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Messagesquare: ImageVector
    get() {
        if (_messagesquare != null) {
            return _messagesquare!!
        }
        _messagesquare = Builder(name = "Messagesquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.28f, 9.7598f)
                verticalLineTo(12.8998f)
                curveTo(18.28f, 13.0998f, 18.27f, 13.2998f, 18.25f, 13.4898f)
                curveTo(18.07f, 15.6098f, 16.82f, 16.6698f, 14.52f, 16.6698f)
                horizontalLineTo(14.21f)
                curveTo(14.01f, 16.6698f, 13.82f, 16.7598f, 13.71f, 16.9198f)
                lineTo(12.77f, 18.1798f)
                curveTo(12.35f, 18.7398f, 11.68f, 18.7398f, 11.26f, 18.1798f)
                lineTo(10.32f, 16.9198f)
                curveTo(10.22f, 16.7898f, 9.99f, 16.6698f, 9.82f, 16.6698f)
                horizontalLineTo(9.51f)
                curveTo(7.0f, 16.6698f, 5.75f, 16.0498f, 5.75f, 12.9098f)
                verticalLineTo(9.7698f)
                curveTo(5.75f, 7.4698f, 6.81f, 6.2198f, 8.93f, 6.0398f)
                curveTo(9.12f, 6.0198f, 9.32f, 6.0098f, 9.52f, 6.0098f)
                horizontalLineTo(14.55f)
                curveTo(17.02f, 5.9998f, 18.28f, 7.2598f, 18.28f, 9.7598f)
                close()
            }
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
        }
        .build()
        return _messagesquare!!
    }

private var _messagesquare: ImageVector? = null

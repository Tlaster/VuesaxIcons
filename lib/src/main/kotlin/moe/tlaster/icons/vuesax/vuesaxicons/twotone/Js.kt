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

public val TwotoneGroup.Js: ImageVector
    get() {
        if (_js != null) {
            return _js!!
        }
        _js = Builder(name = "Js", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 9.0001f)
                lineTo(8.99f, 16.9301f)
                curveTo(8.99f, 18.4501f, 7.35f, 19.4201f, 6.02f, 18.6801f)
                lineTo(3.51f, 17.2901f)
                curveTo(3.19f, 17.1101f, 3.0f, 16.7801f, 3.0f, 16.4201f)
                verticalLineTo(7.6001f)
                curveTo(3.0f, 7.2401f, 3.2f, 6.9001f, 3.51f, 6.7301f)
                lineTo(11.51f, 2.2901f)
                curveTo(11.81f, 2.1201f, 12.18f, 2.1201f, 12.48f, 2.2901f)
                lineTo(20.48f, 6.7301f)
                curveTo(20.8f, 6.9101f, 20.99f, 7.2401f, 20.99f, 7.6001f)
                verticalLineTo(16.4201f)
                curveTo(20.99f, 16.7801f, 20.79f, 17.1201f, 20.48f, 17.2901f)
                lineTo(12.48f, 21.7301f)
                curveTo(12.18f, 21.9001f, 11.81f, 21.9001f, 11.51f, 21.7301f)
                lineTo(10.0f, 21.0001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.75f)
                curveTo(17.0f, 9.78f, 16.22f, 9.0f, 15.25f, 9.0f)
                horizontalLineTo(13.5f)
                curveTo(12.53f, 9.0f, 11.75f, 9.78f, 11.75f, 10.75f)
                curveTo(11.75f, 11.72f, 12.53f, 12.5f, 13.5f, 12.5f)
                horizontalLineTo(15.25f)
                curveTo(16.22f, 12.5f, 17.0f, 13.28f, 17.0f, 14.25f)
                curveTo(17.0f, 15.22f, 16.22f, 16.0f, 15.25f, 16.0f)
                horizontalLineTo(13.5f)
                curveTo(12.53f, 16.0f, 11.75f, 15.22f, 11.75f, 14.25f)
            }
        }
        .build()
        return _js!!
    }

private var _js: ImageVector? = null

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

public val TwotoneGroup.Slidervertical: ImageVector
    get() {
        if (_slidervertical != null) {
            return _slidervertical!!
        }
        _slidervertical = Builder(name = "Slidervertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(17.62f, 6.0f, 18.17f, 6.02f, 18.66f, 6.09f)
                curveTo(21.29f, 6.38f, 22.0f, 7.62f, 22.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(22.0f, 16.38f, 21.29f, 17.62f, 18.66f, 17.91f)
                curveTo(18.17f, 17.98f, 17.62f, 18.0f, 17.0f, 18.0f)
                horizontalLineTo(7.0f)
                curveTo(6.38f, 18.0f, 5.83f, 17.98f, 5.34f, 17.91f)
                curveTo(2.71f, 17.62f, 2.0f, 16.38f, 2.0f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 7.62f, 2.71f, 6.38f, 5.34f, 6.09f)
                curveTo(5.83f, 6.02f, 6.38f, 6.0f, 7.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0001f, 18.0002f)
                curveTo(17.6201f, 18.0002f, 18.1701f, 17.9802f, 18.6601f, 17.9102f)
                curveTo(18.6701f, 18.0502f, 18.6701f, 18.1802f, 18.6701f, 18.3302f)
                verticalLineTo(18.6702f)
                curveTo(18.6701f, 21.3302f, 18.0001f, 22.0002f, 15.3301f, 22.0002f)
                horizontalLineTo(8.6701f)
                curveTo(6.0001f, 22.0002f, 5.3301f, 21.3302f, 5.3301f, 18.6702f)
                verticalLineTo(18.3302f)
                curveTo(5.3301f, 18.1802f, 5.3301f, 18.0502f, 5.3401f, 17.9102f)
                curveTo(5.8301f, 17.9802f, 6.3801f, 18.0002f, 7.0001f, 18.0002f)
                horizontalLineTo(17.0001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6701f, 2.0f)
                horizontalLineTo(15.3301f)
                curveTo(18.0001f, 2.0f, 18.6701f, 2.67f, 18.6701f, 5.33f)
                verticalLineTo(5.67f)
                curveTo(18.6701f, 5.82f, 18.6701f, 5.95f, 18.6601f, 6.09f)
                curveTo(18.1701f, 6.02f, 17.6201f, 6.0f, 17.0001f, 6.0f)
                horizontalLineTo(7.0001f)
                curveTo(6.3801f, 6.0f, 5.8301f, 6.02f, 5.3401f, 6.09f)
                curveTo(5.3301f, 5.95f, 5.3301f, 5.82f, 5.3301f, 5.67f)
                verticalLineTo(5.33f)
                curveTo(5.3301f, 2.67f, 6.0001f, 2.0f, 8.6701f, 2.0f)
                close()
            }
        }
        .build()
        return _slidervertical!!
    }

private var _slidervertical: ImageVector? = null

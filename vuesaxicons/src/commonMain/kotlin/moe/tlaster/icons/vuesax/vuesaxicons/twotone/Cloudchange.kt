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

public val TwotoneGroup.Cloudchange: ImageVector
    get() {
        if (_cloudchange != null) {
            return _cloudchange!!
        }
        _cloudchange = Builder(name = "Cloudchange", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.1103f, 11.8498f)
                curveTo(5.2903f, 12.0498f, 5.3003f, 16.1498f, 8.1103f, 16.3498f)
                horizontalLineTo(14.7803f)
                curveTo(15.5903f, 16.3598f, 16.3703f, 16.0498f, 16.9703f, 15.5098f)
                curveTo(18.9503f, 13.7798f, 17.8903f, 10.3098f, 15.2903f, 9.9798f)
                curveTo(14.3603f, 4.3398f, 6.2103f, 6.4798f, 8.1403f, 11.8498f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 15.0f)
                curveTo(2.0f, 18.87f, 5.13f, 22.0f, 9.0f, 22.0f)
                lineTo(7.95f, 20.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                curveTo(22.0f, 5.13f, 18.87f, 2.0f, 15.0f, 2.0f)
                lineTo(16.05f, 3.75f)
            }
        }
        .build()
        return _cloudchange!!
    }

private var _cloudchange: ImageVector? = null

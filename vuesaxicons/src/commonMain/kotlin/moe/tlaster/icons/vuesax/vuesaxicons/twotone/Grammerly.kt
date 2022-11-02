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

public val TwotoneGroup.Grammerly: ImageVector
    get() {
        if (_grammerly != null) {
            return _grammerly!!
        }
        _grammerly = Builder(name = "Grammerly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0707f, 4.9501f)
                curveTo(23.0407f, 8.9201f, 22.9707f, 15.4f, 18.8707f, 19.29f)
                curveTo(15.0807f, 22.88f, 8.9307f, 22.88f, 5.1307f, 19.29f)
                curveTo(1.0207f, 15.4f, 0.9507f, 8.9201f, 4.9307f, 4.9501f)
                curveTo(8.8307f, 1.0401f, 15.1707f, 1.0401f, 19.0707f, 4.9501f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8399f, 16.0698f)
                curveTo(13.7199f, 18.0698f, 10.2799f, 18.0698f, 8.1699f, 16.0698f)
            }
        }
        .build()
        return _grammerly!!
    }

private var _grammerly: ImageVector? = null

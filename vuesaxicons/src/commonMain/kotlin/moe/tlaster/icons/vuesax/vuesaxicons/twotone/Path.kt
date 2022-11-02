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

public val TwotoneGroup.Path: ImageVector
    get() {
        if (_path != null) {
            return _path!!
        }
        _path = Builder(name = "Path", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.7901f, 7.2701f)
                lineTo(16.7601f, 4.2401f)
                curveTo(15.6101f, 3.0901f, 14.0401f, 3.1501f, 13.2701f, 4.3801f)
                lineTo(11.5801f, 7.0501f)
                lineTo(16.9801f, 12.4501f)
                lineTo(19.6501f, 10.7601f)
                curveTo(20.8001f, 10.0301f, 20.8701f, 8.3501f, 19.7901f, 7.2701f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.58f, 7.0504f)
                lineTo(7.65f, 6.8105f)
                curveTo(5.46f, 6.6804f, 4.69f, 7.3505f, 4.45f, 9.4404f)
                lineTo(3.47f, 17.7604f)
                curveTo(3.26f, 19.5104f, 4.53f, 20.7704f, 6.27f, 20.5604f)
                lineTo(14.59f, 19.5804f)
                curveTo(16.68f, 19.3304f, 17.44f, 18.5704f, 17.22f, 16.3804f)
                lineTo(16.99f, 12.4504f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.6094f, 19.4199f)
                lineTo(7.6394f, 16.3799f)
            }
        }
        .build()
        return _path!!
    }

private var _path: ImageVector? = null

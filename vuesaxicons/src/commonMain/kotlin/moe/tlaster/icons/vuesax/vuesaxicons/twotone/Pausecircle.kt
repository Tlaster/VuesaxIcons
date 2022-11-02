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

public val TwotoneGroup.Pausecircle: ImageVector
    get() {
        if (_pausecircle != null) {
            return _pausecircle!!
        }
        _pausecircle = Builder(name = "Pausecircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9707f, 22.0f)
                curveTo(17.4936f, 22.0f, 21.9707f, 17.5228f, 21.9707f, 12.0f)
                curveTo(21.9707f, 6.4771f, 17.4936f, 2.0f, 11.9707f, 2.0f)
                curveTo(6.4479f, 2.0f, 1.9707f, 6.4771f, 1.9707f, 12.0f)
                curveTo(1.9707f, 17.5228f, 6.4479f, 22.0f, 11.9707f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.72f, 14.5298f)
                verticalLineTo(9.4698f)
                curveTo(10.72f, 8.9898f, 10.52f, 8.7998f, 10.01f, 8.7998f)
                horizontalLineTo(8.71f)
                curveTo(8.2f, 8.7998f, 8.0f, 8.9898f, 8.0f, 9.4698f)
                verticalLineTo(14.5298f)
                curveTo(8.0f, 15.0098f, 8.2f, 15.1998f, 8.71f, 15.1998f)
                horizontalLineTo(10.0f)
                curveTo(10.52f, 15.1998f, 10.72f, 15.0098f, 10.72f, 14.5298f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9991f, 14.5298f)
                verticalLineTo(9.4698f)
                curveTo(15.9991f, 8.9898f, 15.7991f, 8.7998f, 15.2891f, 8.7998f)
                horizontalLineTo(13.9991f)
                curveTo(13.4891f, 8.7998f, 13.2891f, 8.9898f, 13.2891f, 9.4698f)
                verticalLineTo(14.5298f)
                curveTo(13.2891f, 15.0098f, 13.4891f, 15.1998f, 13.9991f, 15.1998f)
                horizontalLineTo(15.2891f)
                curveTo(15.7991f, 15.1998f, 15.9991f, 15.0098f, 15.9991f, 14.5298f)
                close()
            }
        }
        .build()
        return _pausecircle!!
    }

private var _pausecircle: ImageVector? = null

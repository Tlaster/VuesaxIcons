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

public val TwotoneGroup.Notesquare: ImageVector
    get() {
        if (_notesquare != null) {
            return _notesquare!!
        }
        _notesquare = Builder(name = "Notesquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(11.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5098f, 22.0f)
                curveTo(16.6143f, 22.0f, 17.5098f, 21.1046f, 17.5098f, 20.0f)
                curveTo(17.5098f, 18.8954f, 16.6143f, 18.0f, 15.5098f, 18.0f)
                curveTo(14.4052f, 18.0f, 13.5098f, 18.8954f, 13.5098f, 20.0f)
                curveTo(13.5098f, 21.1046f, 14.4052f, 22.0f, 15.5098f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5098f, 19.9998f)
                verticalLineTo(13.0098f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.8198f, 12.0699f)
                lineTo(21.0298f, 12.8099f)
                curveTo(21.5598f, 12.9899f, 21.9998f, 13.5899f, 21.9998f, 14.1599f)
                verticalLineTo(14.7499f)
                curveTo(21.9998f, 15.5099f, 21.4098f, 15.9399f, 20.6898f, 15.6999f)
                lineTo(18.4797f, 14.9599f)
                curveTo(17.9497f, 14.7799f, 17.5098f, 14.1799f, 17.5098f, 13.6099f)
                verticalLineTo(13.0199f)
                curveTo(17.5098f, 12.2499f, 18.0998f, 11.8299f, 18.8198f, 12.0699f)
                close()
            }
        }
        .build()
        return _notesquare!!
    }

private var _notesquare: ImageVector? = null

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

public val LinearGroup.Notesquare: ImageVector
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
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.51f, 22.0f)
                curveTo(16.6146f, 22.0f, 17.51f, 21.1046f, 17.51f, 20.0f)
                curveTo(17.51f, 18.8954f, 16.6146f, 18.0f, 15.51f, 18.0f)
                curveTo(14.4054f, 18.0f, 13.51f, 18.8954f, 13.51f, 20.0f)
                curveTo(13.51f, 21.1046f, 14.4054f, 22.0f, 15.51f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.51f, 19.9998f)
                verticalLineTo(13.0098f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.82f, 12.0699f)
                lineTo(21.03f, 12.8099f)
                curveTo(21.56f, 12.9899f, 22.0f, 13.5899f, 22.0f, 14.1599f)
                verticalLineTo(14.7499f)
                curveTo(22.0f, 15.5099f, 21.41f, 15.9399f, 20.69f, 15.6999f)
                lineTo(18.48f, 14.9599f)
                curveTo(17.95f, 14.7799f, 17.51f, 14.1799f, 17.51f, 13.6099f)
                verticalLineTo(13.0199f)
                curveTo(17.51f, 12.2499f, 18.1f, 11.8299f, 18.82f, 12.0699f)
                close()
            }
        }
        .build()
        return _notesquare!!
    }

private var _notesquare: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Pictureframe: ImageVector
    get() {
        if (_pictureframe != null) {
            return _pictureframe!!
        }
        _pictureframe = Builder(name = "Pictureframe", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.51f, 11.22f)
                lineTo(8.31f, 2.39f)
                curveTo(8.26f, 2.16f, 8.05f, 2.0f, 7.81f, 2.0f)
                curveTo(4.6f, 2.0f, 2.0f, 4.6f, 2.0f, 7.81f)
                verticalLineTo(13.51f)
                curveTo(2.0f, 13.85f, 2.33f, 14.1f, 2.66f, 14.0f)
                lineTo(10.16f, 11.83f)
                curveTo(10.42f, 11.76f, 10.58f, 11.49f, 10.51f, 11.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.12f, 13.6789f)
                curveTo(11.05f, 13.3989f, 10.76f, 13.2289f, 10.48f, 13.3089f)
                lineTo(2.37f, 15.6689f)
                curveTo(2.15f, 15.7389f, 2.0f, 15.9389f, 2.0f, 16.1689f)
                verticalLineTo(16.1889f)
                curveTo(2.0f, 19.3989f, 4.6f, 21.9989f, 7.81f, 21.9989f)
                horizontalLineTo(12.53f)
                curveTo(12.86f, 21.9989f, 13.11f, 21.6889f, 13.03f, 21.3589f)
                lineTo(11.12f, 13.6789f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1908f, 2.0f)
                horizontalLineTo(10.4408f)
                curveTo(10.1108f, 2.0f, 9.8608f, 2.31f, 9.9408f, 2.64f)
                lineTo(14.6808f, 21.61f)
                curveTo(14.7408f, 21.84f, 14.9408f, 22.0f, 15.1808f, 22.0f)
                horizontalLineTo(16.1808f)
                curveTo(19.4008f, 22.0f, 22.0008f, 19.4f, 22.0008f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0008f, 4.6f, 19.4008f, 2.0f, 16.1908f, 2.0f)
                close()
            }
        }
        .build()
        return _pictureframe!!
    }

private var _pictureframe: ImageVector? = null

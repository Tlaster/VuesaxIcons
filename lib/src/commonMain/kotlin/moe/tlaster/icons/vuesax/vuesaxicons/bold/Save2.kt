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

public val BoldGroup.Save2: ImageVector
    get() {
        if (_save2 != null) {
            return _save2!!
        }
        _save2 = Builder(name = "Save2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.89f, 5.8789f)
                horizontalLineTo(5.11f)
                curveTo(3.4f, 5.8789f, 2.0f, 7.2789f, 2.0f, 8.9889f)
                verticalLineTo(20.3489f)
                curveTo(2.0f, 21.7989f, 3.04f, 22.4189f, 4.31f, 21.7089f)
                lineTo(8.24f, 19.5189f)
                curveTo(8.66f, 19.2889f, 9.34f, 19.2889f, 9.75f, 19.5189f)
                lineTo(13.68f, 21.7089f)
                curveTo(14.96f, 22.4089f, 16.0f, 21.7989f, 16.0f, 20.3489f)
                verticalLineTo(8.9889f)
                curveTo(16.0f, 7.2789f, 14.6f, 5.8789f, 12.89f, 5.8789f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.9998f, 5.11f)
                verticalLineTo(16.47f)
                curveTo(21.9998f, 17.92f, 20.9598f, 18.53f, 19.6898f, 17.83f)
                lineTo(17.7598f, 16.75f)
                curveTo(17.5998f, 16.66f, 17.4998f, 16.49f, 17.4998f, 16.31f)
                verticalLineTo(8.99f)
                curveTo(17.4998f, 6.45f, 15.4298f, 4.38f, 12.8898f, 4.38f)
                horizontalLineTo(8.8198f)
                curveTo(8.4498f, 4.38f, 8.1898f, 3.99f, 8.3598f, 3.67f)
                curveTo(8.8798f, 2.68f, 9.9198f, 2.0f, 11.1098f, 2.0f)
                horizontalLineTo(18.8898f)
                curveTo(20.5998f, 2.0f, 21.9998f, 3.4f, 21.9998f, 5.11f)
                close()
            }
        }
        .build()
        return _save2!!
    }

private var _save2: ImageVector? = null

package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Speedometer: ImageVector
    get() {
        if (_speedometer != null) {
            return _speedometer!!
        }
        _speedometer = Builder(name = "Speedometer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.14f, 20.25f)
                curveTo(18.95f, 20.25f, 18.76f, 20.18f, 18.61f, 20.04f)
                curveTo(18.31f, 19.75f, 18.31f, 19.28f, 18.6f, 18.98f)
                curveTo(20.31f, 17.24f, 21.25f, 14.94f, 21.25f, 12.5f)
                curveTo(21.25f, 7.4f, 17.1f, 3.25f, 12.0f, 3.25f)
                curveTo(6.9f, 3.25f, 2.75f, 7.4f, 2.75f, 12.5f)
                curveTo(2.75f, 14.93f, 3.68f, 17.22f, 5.38f, 18.96f)
                curveTo(5.67f, 19.26f, 5.66f, 19.73f, 5.37f, 20.02f)
                curveTo(5.07f, 20.31f, 4.6f, 20.3f, 4.31f, 20.01f)
                curveTo(2.34f, 17.99f, 1.25f, 15.32f, 1.25f, 12.5f)
                curveTo(1.25f, 6.57f, 6.07f, 1.75f, 12.0f, 1.75f)
                curveTo(17.93f, 1.75f, 22.75f, 6.57f, 22.75f, 12.5f)
                curveTo(22.75f, 15.33f, 21.66f, 18.01f, 19.67f, 20.03f)
                curveTo(19.53f, 20.18f, 19.33f, 20.25f, 19.14f, 20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9989f, 22.25f)
                curveTo(9.7289f, 22.25f, 7.8789f, 20.4f, 7.8789f, 18.13f)
                curveTo(7.8789f, 15.86f, 9.7289f, 14.0f, 11.9989f, 14.0f)
                curveTo(14.2689f, 14.0f, 16.1189f, 15.85f, 16.1189f, 18.12f)
                curveTo(16.1189f, 20.39f, 14.2689f, 22.25f, 11.9989f, 22.25f)
                close()
                moveTo(11.9989f, 15.5f)
                curveTo(10.5489f, 15.5f, 9.3789f, 16.68f, 9.3789f, 18.12f)
                curveTo(9.3789f, 19.56f, 10.5589f, 20.74f, 11.9989f, 20.74f)
                curveTo(13.4389f, 20.74f, 14.6189f, 19.56f, 14.6189f, 18.12f)
                curveTo(14.6189f, 16.68f, 13.4489f, 15.5f, 11.9989f, 15.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.75f)
                horizontalLineTo(15.25f)
                curveTo(14.42f, 12.75f, 13.75f, 12.08f, 13.75f, 11.25f)
                verticalLineTo(10.5f)
                curveTo(13.75f, 9.26f, 14.76f, 8.25f, 16.0f, 8.25f)
                curveTo(17.24f, 8.25f, 18.25f, 9.26f, 18.25f, 10.5f)
                curveTo(18.25f, 11.74f, 17.24f, 12.75f, 16.0f, 12.75f)
                close()
                moveTo(16.0f, 9.75f)
                curveTo(15.59f, 9.75f, 15.25f, 10.09f, 15.25f, 10.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 11.25f, 16.75f, 10.91f, 16.75f, 10.5f)
                curveTo(16.75f, 10.09f, 16.41f, 9.75f, 16.0f, 9.75f)
                close()
            }
        }
        .build()
        return _speedometer!!
    }

private var _speedometer: ImageVector? = null

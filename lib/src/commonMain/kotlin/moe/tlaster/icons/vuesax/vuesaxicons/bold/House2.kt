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

public val BoldGroup.House2: ImageVector
    get() {
        if (_house2 != null) {
            return _house2!!
        }
        _house2 = Builder(name = "House2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 15.5f)
                curveTo(9.59f, 15.5f, 9.25f, 15.84f, 9.25f, 16.25f)
                verticalLineTo(17.75f)
                curveTo(9.25f, 18.16f, 9.59f, 18.5f, 10.0f, 18.5f)
                curveTo(10.41f, 18.5f, 10.75f, 18.16f, 10.75f, 17.75f)
                verticalLineTo(16.25f)
                curveTo(10.75f, 15.84f, 10.41f, 15.5f, 10.0f, 15.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 21.2488f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.9788f)
                curveTo(21.0f, 9.3588f, 20.72f, 8.7788f, 20.23f, 8.3988f)
                lineTo(13.23f, 2.9588f)
                curveTo(12.51f, 2.3888f, 11.49f, 2.3888f, 10.77f, 2.9588f)
                lineTo(3.77f, 8.3988f)
                curveTo(3.28f, 8.7788f, 3.0f, 9.3588f, 3.0f, 9.9688f)
                lineTo(2.95f, 21.2488f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 21.2488f, 1.25f, 21.5788f, 1.25f, 21.9988f)
                curveTo(1.25f, 22.4088f, 1.59f, 22.7488f, 2.0f, 22.7488f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 22.7488f, 22.75f, 22.4088f, 22.75f, 21.9988f)
                curveTo(22.75f, 21.5788f, 22.41f, 21.2488f, 22.0f, 21.2488f)
                close()
                moveTo(10.5f, 6.7488f)
                horizontalLineTo(13.5f)
                curveTo(13.91f, 6.7488f, 14.25f, 7.0887f, 14.25f, 7.4988f)
                curveTo(14.25f, 7.9088f, 13.91f, 8.2487f, 13.5f, 8.2487f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 8.2487f, 9.75f, 7.9088f, 9.75f, 7.4988f)
                curveTo(9.75f, 7.0887f, 10.09f, 6.7488f, 10.5f, 6.7488f)
                close()
                moveTo(17.0f, 21.2488f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.4987f)
                curveTo(7.0f, 11.6687f, 7.67f, 10.9987f, 8.5f, 10.9987f)
                horizontalLineTo(15.5f)
                curveTo(16.33f, 10.9987f, 17.0f, 11.6687f, 17.0f, 12.4987f)
                verticalLineTo(21.2488f)
                close()
            }
        }
        .build()
        return _house2!!
    }

private var _house2: ImageVector? = null

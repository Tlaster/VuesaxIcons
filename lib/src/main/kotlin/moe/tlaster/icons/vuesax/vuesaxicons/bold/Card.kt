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

public val BoldGroup.Card: ImageVector
    get() {
        if (_card != null) {
            return _card!!
        }
        _card = Builder(name = "Card", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.5484f)
                curveTo(22.0f, 8.2084f, 21.46f, 8.7484f, 20.8f, 8.7484f)
                horizontalLineTo(3.2f)
                curveTo(2.54f, 8.7484f, 2.0f, 8.2084f, 2.0f, 7.5484f)
                verticalLineTo(7.5384f)
                curveTo(2.0f, 5.2484f, 3.85f, 3.3984f, 6.14f, 3.3984f)
                horizontalLineTo(17.85f)
                curveTo(20.14f, 3.3984f, 22.0f, 5.2584f, 22.0f, 7.5484f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 11.45f)
                verticalLineTo(16.46f)
                curveTo(2.0f, 18.75f, 3.85f, 20.6f, 6.14f, 20.6f)
                horizontalLineTo(17.85f)
                curveTo(20.14f, 20.6f, 22.0f, 18.74f, 22.0f, 16.45f)
                verticalLineTo(11.45f)
                curveTo(22.0f, 10.79f, 21.46f, 10.25f, 20.8f, 10.25f)
                horizontalLineTo(3.2f)
                curveTo(2.54f, 10.25f, 2.0f, 10.79f, 2.0f, 11.45f)
                close()
                moveTo(8.0f, 17.25f)
                horizontalLineTo(6.0f)
                curveTo(5.59f, 17.25f, 5.25f, 16.91f, 5.25f, 16.5f)
                curveTo(5.25f, 16.09f, 5.59f, 15.75f, 6.0f, 15.75f)
                horizontalLineTo(8.0f)
                curveTo(8.41f, 15.75f, 8.75f, 16.09f, 8.75f, 16.5f)
                curveTo(8.75f, 16.91f, 8.41f, 17.25f, 8.0f, 17.25f)
                close()
                moveTo(14.5f, 17.25f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 17.25f, 9.75f, 16.91f, 9.75f, 16.5f)
                curveTo(9.75f, 16.09f, 10.09f, 15.75f, 10.5f, 15.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 15.75f, 15.25f, 16.09f, 15.25f, 16.5f)
                curveTo(15.25f, 16.91f, 14.91f, 17.25f, 14.5f, 17.25f)
                close()
            }
        }
        .build()
        return _card!!
    }

private var _card: ImageVector? = null

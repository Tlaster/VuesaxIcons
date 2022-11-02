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

public val OutlineGroup.Card: ImageVector
    get() {
        if (_card != null) {
            return _card!!
        }
        _card = Builder(name = "Card", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.25f)
                horizontalLineTo(2.0f)
                curveTo(1.59f, 9.25f, 1.25f, 8.91f, 1.25f, 8.5f)
                curveTo(1.25f, 8.09f, 1.59f, 7.75f, 2.0f, 7.75f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 7.75f, 22.75f, 8.09f, 22.75f, 8.5f)
                curveTo(22.75f, 8.91f, 22.41f, 9.25f, 22.0f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 17.25f)
                horizontalLineTo(6.0f)
                curveTo(5.59f, 17.25f, 5.25f, 16.91f, 5.25f, 16.5f)
                curveTo(5.25f, 16.09f, 5.59f, 15.75f, 6.0f, 15.75f)
                horizontalLineTo(8.0f)
                curveTo(8.41f, 15.75f, 8.75f, 16.09f, 8.75f, 16.5f)
                curveTo(8.75f, 16.91f, 8.41f, 17.25f, 8.0f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 17.25f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 17.25f, 9.75f, 16.91f, 9.75f, 16.5f)
                curveTo(9.75f, 16.09f, 10.09f, 15.75f, 10.5f, 15.75f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 15.75f, 15.25f, 16.09f, 15.25f, 16.5f)
                curveTo(15.25f, 16.91f, 14.91f, 17.25f, 14.5f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.56f, 21.25f)
                horizontalLineTo(6.44f)
                curveTo(2.46f, 21.25f, 1.25f, 20.05f, 1.25f, 16.11f)
                verticalLineTo(7.89f)
                curveTo(1.25f, 3.95f, 2.46f, 2.75f, 6.44f, 2.75f)
                horizontalLineTo(17.55f)
                curveTo(21.53f, 2.75f, 22.74f, 3.95f, 22.74f, 7.89f)
                verticalLineTo(16.1f)
                curveTo(22.75f, 20.05f, 21.54f, 21.25f, 17.56f, 21.25f)
                close()
                moveTo(6.44f, 4.25f)
                curveTo(3.3f, 4.25f, 2.75f, 4.79f, 2.75f, 7.89f)
                verticalLineTo(16.1f)
                curveTo(2.75f, 19.2f, 3.3f, 19.74f, 6.44f, 19.74f)
                horizontalLineTo(17.55f)
                curveTo(20.69f, 19.74f, 21.24f, 19.2f, 21.24f, 16.1f)
                verticalLineTo(7.89f)
                curveTo(21.24f, 4.79f, 20.69f, 4.25f, 17.55f, 4.25f)
                horizontalLineTo(6.44f)
                close()
            }
        }
        .build()
        return _card!!
    }

private var _card: ImageVector? = null
